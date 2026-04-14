package org.monalisa.com.pricelist.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.util.CLogger;
import org.compiere.util.EMail;
import org.compiere.util.Util;

public class EmailUtils
{
	/** Log */
	private static final CLogger log = CLogger.getCLogger(EmailUtils.class);

	public static String sendEmail(	Properties ctx, List<File> files, ArrayList<String> emailList, String from,
									boolean isHTML, String subject, String message)
	{
		MClient client = MClient.get(ctx);
		String sentStatus = "OK";

		String emailID = "";
		if (emailList != null && emailList.size() > 0)
		{
			emailID = emailList.get(0);
			emailList.remove(0);
		}
		try
		{
			if (!Util.isEmpty(emailID, true))
			{
				EMail email = null;
				if (!Util.isEmpty(from, true))
					email = client.createEMailFrom(from, emailID, null, null, isHTML);
				else
					email = client.createEMail(emailID, null, null);

				addStrEmailTo(emailList, email);

				email.setSubject(subject);

				if (isHTML)
					email.setMessageHTML(subject, message);
				else
					email.setMessageText(message);

				if (files != null)
				{
					StringBuilder msglog = new StringBuilder().append(emailID).append(" - ").append(files);
					if (log.isLoggable(Level.FINE))
						log.fine(msglog.toString());
					email.addAttachments(files);
				}
				sentStatus = email.send();
			}
			else
			{
				sentStatus = "Email Address not found: " + emailID;
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, e.getMessage());
			sentStatus = "Not able to send email " + emailID + " : " + e.getMessage();
		}
		return sentStatus;
	}

	public static void addStrEmailTo(List<String> emailList, EMail email)
	{
		for (String emailID : emailList)
		{
			if (!Util.isEmpty(emailID))
			{
				email.addTo(emailID);
			}
		}
	}
}
