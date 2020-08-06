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
                
                sh "sudo rsync -zvh /var/lib/jenkins/workspace/pipeline/target/file-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Desktop/"
                sh "sudo chown ubuntu:ubuntu /home/ubuntu/Desktop/file-demo-0.0.1-SNAPSHOT.jar"                
                sh "sudo scp -P 32 -i /home/ubuntu/Desktop/Deployserver.pem /home/ubuntu/Desktop/file-demo-0.0.1-SNAPSHOT.jar ubuntu@13.251.140.214:/home/ubuntu/Documents"
                sh "chown jenkins:jenkins /home/ubuntu/Desktop/Deployserver.pem"
                sh "ssh -p 32 -i /home/ubuntu/Desktop/Deployserver.pem -tt ubuntu@13.251.140.214 'java -jar /home/ubuntu/Documents/file-demo-0.0.1-SNAPSHOT.jar'"
                  }
                }
             }
    stage("Email notification"){     
                mail bcc: '', body: '''Pipeline successfully executed
                ''', cc: 'sanjeevikumaran514@gmail.com', from: '', replyTo: '', subject: 'Test email ', to: 'sanjeevikumaran514@gmail.com'
         
             } 
           }

