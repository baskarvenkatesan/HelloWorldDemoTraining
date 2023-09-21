pipeline{
	agent any
		stage("Parallel Execution"){
			steps{
				parallel{
					a:{
						bat "mvn clean"
					}
					b:{
						bat "mvn test"
					}
					a:{
						bat "mvn package"
					}
				}
			
			}
		}
		stage("Consolidate the result"){
			steps{
				input("Do you want to capture the results?")
				junit '**/target/surefire-reports/TEST-*.xml'
				archive'target/*.jar'
				}
		}
		stage("Email Build Status"){
			steps{
			mail bcc: 'com.baskar.training@gmail.com', body: 'The decl pipeline job has been completed', cc: 'com.baskar.training@gmail.com', from: '', replyTo: '', subject: 'Decl pipeline job', to: 'com.baskar.training@gmail.com'
			}
		}
		
	}
}
