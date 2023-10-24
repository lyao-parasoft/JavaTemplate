pipeline {
    agent {
  label 'built-in'
}
    stages {
        stage('Parasoft coverage') {
            steps { bat '''mvn process-test-classes jtest:agent test jtest:jtest "-Djtest.settings=./localsettings.properties" "-Djtest.config=builtin://Unit Tests" "-Djtest.report=./build/report/jtest/junit"'''
                recordParasoftCoverage coverageQualityGates: [[criticality: 'UNSTABLE', threshold: 0.0, type: 'MODIFIED_LINES'], [criticality: 'UNSTABLE', threshold: 0.0, type: 'PROJECT']], pattern: '**/coverage.xml', referenceBuild: ''
                        }
        }
    }
}