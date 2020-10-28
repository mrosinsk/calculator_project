pipeline {
    agent any
    environment {
        NEW_VERSION = "1.3.0"
        SERVER_CREDENTIALS = credentials('server-credentials')
    }

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    }

	//CODE_CHANGES = getGitChanges()


    stages {
        stage('Verify Branch') {
          steps {
			echo "$GIT_BRANCH"
          }
        }

		stage('build') {
			when{
				expression {
					BRANCH_NAME == "test" || BRANCH_NAME == "dev"
				}
			}

          steps {
			echo 'building the app...'
			echo "version: ${NEW_VERSION}"
          }
        }

		stage('test') {
			when{
				expression {
					BRANCH_NAME == "test"
				}
			}

          steps {
			echo "testing the app..."
			echo "testing version ${params.VERSION}"
          }
        }

		stage('deploy') {
          steps {
			echo 'deploying the app...'
			echo "deploying with ${SERVER_CREDENTIALS}"
			sh "${SERVER_CREDENTIALS}"

          }
        }


    }

   post {

		always{
			echo "block always!!!"
		}

        success{
			echo "App started successfully :)"
        }

       failure{
			echo "App failed to start :("
       }
    }
}
