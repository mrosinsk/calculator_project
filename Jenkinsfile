def gv

pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: "executeTests", defaultValue: true, description: "")
    }


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
          }
        }

		stage('test') {
			when{
				expression {
					params.executeTests
				}
			}

          steps {
			echo "testing the app..."

          }
        }

		stage('deploy') {
          steps {
			echo 'deploying the app...'
			echo "deploying version ${params.VERSION}"

          }
        }

        stage('init groovy script'){
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage('read groovy script'){
                    steps {
                        script {
                            gv.buildApp()
                        }
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
