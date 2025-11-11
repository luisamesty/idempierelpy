#  COMMAND TO Build Maven Plugins
#mvn verify -Didempiere.target=org.amerpsoft.com.idempiere.p2.targetplatform -X
mvn -Dmaven.repo.local=$HOME/.m2/repository_12_OK clean install
