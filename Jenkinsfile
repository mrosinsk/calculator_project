pipeline {
    agent any


    stages {

        stage('run backend') {
              steps {
                  echo 'executing gradle...'
                  sh './gradlew -v'
              }
        }
    }
}
