pipeline{
	agent any
		stages{
			stage("Cleaning Stage"){
				steps{
					bat "mvn clean"
					}
				}
			stage("Testing stage"){
				steps{
					bat "mvn test"
					}
				}
			stage("Packaging stage"){
				steps{
					bat "mvn package"
					}
				}
			stage("Consolidation of Test results"){
				steps{
					input("Do you want to capture the results?")
					junit '**/target/surefire-reports/TEST-*.xml'
					archive'target/*.jar'
				}
		
			}
	
	}
	
}
