pipeline{
       agent any
       stages {
              stage('Build') {
                steps 
                     {
                  sh 'mvn clean install'
		     }//End of steps	     
post {			     
	always {		     
	    echo "Build status"
	         }    
     }//End of post	
              
	      }//End of stage Build
   
	       stage('Email') {       
		 steps { 
 post {
        
      success {
            echo 'Build success'
mail bcc: '', body: "<b>Build success</b><br><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: 'sanjeevikumaran52@gmail.com', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "sanjeevi@wisdomtoolz.com";
              }
      failure {
	       echo 'Build failed'
mail bcc: '', body: "<b>Build failed</b><br><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: 'sanjeevikumaran52@gmail.com', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "sanjeevi@wisdomtoolz.com";
              }
     }
		 }//End of steps
	       }//End of stage email	 
             }//End of stages
          }//End of pipeline
