pipeline {
    agent any
    stages {
        stage 1 ('Example clean') {
            steps {
               sh "mvn clean"
            }
        }
        stage 2 ('Example install') {
            steps {
                sh "mvn install"
            }
        }
      }  
    }   
      
