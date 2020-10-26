pipeline {
    agent any


    stages {


        stage('Verify Branch') {
              steps {
                  sh 'echo $GIT_BRANCH'
              }
        }

        stage("Hello") {
               steps {
                    echo "Hello World"
               }
        }


	}
}
