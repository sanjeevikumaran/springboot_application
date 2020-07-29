pipeline {
    agent any
    stages {
        stage('Example clean') {
            steps {
               sh "mvn clean"
            }
        }
        stage('Example install') {
            steps {
                sh "mvn install"
            }
        }
      }  
    }   
      
