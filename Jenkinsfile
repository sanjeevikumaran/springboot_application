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

           //stage('Email notification') 
             // {     
            //steps {
              //  mail bcc: '', body: '''Pipeline successfully executed
               // ''', cc: 'sanjeevikumaran514@gmail.com', from: '', replyTo: '', subject: 'Test email ', to: 'sanjeevikumaran514@gmail.com'
               //   }
              // } 
          
            stage('Test Stage') 
               {
            steps {
                checkout changelog: true, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/Sample_branch']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'TestCredentials', url: '']]]
                script {
                     Author_ID=sh(script: "git show -s --pretty=%an", returnStdout: true).trim()
                     Author_Name=sh(script: "git show -s --pretty=%ae", returnStdout: true).trim()
                       }
                echo "${Author_ID} and ${Author_Name}"
                  }
               }
             
 
          }  
        }
