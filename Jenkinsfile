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
                echo "Message"
            }
        }
        stage('Example deploy') {
            steps {
                
                sh "sudo rsync -zvh /var/lib/jenkins/workspace/pipeline/target/file-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Desktop/"
                sh "sudo scp -i /home/ubuntu/Desktop/Deployserver.pem -P 32 file-demo-0.0.1-SNAPSHOT.jar ubuntu@13.251.140.214:/home/ubuntu/Documents"
         
                  }
                }
              }
           }

