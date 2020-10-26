pipeline {
    agent any


    stages {


        stage('Verify Branch') {
              steps {
                  echo "$GIT_BRANCH"
              }
        }

        stage('Verify Branch in another way') {
                      steps {
                          echo "${BRANCH_NAME}"
                      }
                }

        stage("Hello") {
               steps {
                    echo "Hello World"
               }
        }


	}
}
