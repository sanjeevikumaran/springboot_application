pipeline {
    
    agent any
    stages 
          {
        
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
        stage('Example deploy') {
            steps {
                sh "cd /var/lib/jenkins/workspace/pipeline/target"
                sh "sudo cp -v file-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Documents/"
                  }
                }
              }
           }

