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
            //options 
              // {
             //      timestamps()
              // }
            
            //stage('Push finder') 
            //   {
           // steps {
             //   checkout changelog: true, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: []]
              //  script {
               //      Author_ID=sh(script: "git show -s --pretty=%an", returnStdout: true).trim()
                 //    //Author_Name=sh(script: "git show -s --pretty=%ae", returnStdout: true).trim()
                   //    }
              //  echo "${Author_ID}"              // echo "${Author_ID} and ${Author_Name}"
                //  }
              // }
            }    
               
            post {
              always {
                 mail to: 'sanjeevikumaran52@gmail.com',
                 subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}";    
                 body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                 
    }
}
               
               
               
              
       }
