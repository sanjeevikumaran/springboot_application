def isBuildSuccess = false
pipeline {
    agent any
    stages {
        
        stage('Build') 
              {
            steps {
                script {
               isBuildSuccess = Build()
                /*echo "${isBuildSuccess}" */
                       }
                  }
              }
        stage('Email')
              {        
            steps {
                 email()
                  }
              }

           } 
         }

boolean Build() 
           {
    
            mvn clean install
            
           }

void email()
           {

           if(isBuildSuccess)
              {
              
 
  def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  def summary = "${subject} (${env.BUILD_URL})"
  def details = """<p>Successfully finished: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""

  emailext (
      subject: subject,
      body: details,
      to: 'sanjeevikumaran514@gmail.com','sanjeevik470@gmail.com'
           )
                              

              }
          
          else
              {
               
  
  def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  def summary = "${subject} (${env.BUILD_URL})"
  def details = """<p>Build failure happened: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""

  emailext (
      subject: subject,
      body: details,
      to: 'sanjeevikumaran514@gmail.com','sanjeevik470@gmail.com'
           )
   
             }        


           }
