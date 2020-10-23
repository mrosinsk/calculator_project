pipeline {
    agent any

    stages {
        stage("Hello") {
            steps {
                echo "Hello World"
            }
		}

        stage("Build") {
             steps {
                sh "compileJava"
             }
        }

        stage("Test") {
              steps {
                 sh "test"
              }
        }


	}
}
