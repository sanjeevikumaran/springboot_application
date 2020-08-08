pipeline {
    
    agent any
    stages 
           {
        
            stage('Example clean') 
              {
             steps {
               sh "mvn clean"
                   }
              }  
           
           stage('Example install') 
              {
            steps {
                sh "mvn install"
                echo "Message"
                  }  
              }

           stage('Email notification') 
              {     
            steps {
                mail bcc: '', body: '''Pipeline successfully executed
                ''', cc: 'sanjeevikumaran514@gmail.com', from: '', replyTo: '', subject: 'Test email ', to: 'sanjeevikumaran514@gmail.com'
                  }
              } 
          
           stage('Example push finder')
              {
            steps { 
                def isStartedByUser = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause) != null
                  }
              }

 
          }  
        }
