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
            junit 'build/reports/**/*.xml'
	        }
      }	 
	       }//End of stage build
             }//End of stages
          }//End of pipeline
