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
                sh "sudo chown jenkins:jenkins file-demo-0.0.1-SNAPSHOT.jar"                
                sh "sudo scp -P 32 -i /home/ubuntu/Desktop/Deployserver.pem file-demo-0.0.1-SNAPSHOT.jar ubuntu@13.251.140.214:/home/ubuntu/Documents"
         
                  }
                }
              }
           }

