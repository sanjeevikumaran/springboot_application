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
                
                sh "sudo rsync -zvh /var/lib/jenkins/workspace/pipeline/target/file-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Documents/"
                sh "sudo scp -P 32 -i Deployserver.pem file-demo-0.0.1-SNAPSHOT.jar ubuntu@13.251.140.214:/home/ubuntu/Documents"
         
                  }
                }
              }
           }

