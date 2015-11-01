mvn clean

cd release-dependency-management-service
mvn clean liferay:build-service

cd ..
mvn package