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
                echo "Build successfully finshed"
            }
        }
        stage('Example deploy') {
            steps {
                
                sh "sudo rsync -zvh /var/lib/jenkins/workspace/pipeline/targetfile-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Documents/"
                  }
                }
              }
           }

