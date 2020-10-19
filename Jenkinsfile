pipeline {
    agent any
    stages {
        stage('Build') {
		   steps { 
		     sh 'mvn clean install'
		         }
		
		 }
		stage('Send Email') {
            steps {
            node ('master'){
                echo 'Send Email'
            }
        }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello!'
        }
        success {
            mail to: 'sanjeevi@wisdomtoolz.com',
            subject: "Successful Pipeline: ${currentBuild.fullDisplayName}",
            body: "Here is the link ${env.BUILD_URL}"
        }
        failure {
            mail to: 'sanjeevi@wisdomtoolz.com',
            subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
            body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
