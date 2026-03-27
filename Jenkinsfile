pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Récupération du code source depuis GitHub...'
                checkout scm
            }
        }

        stage('Analyse Qualité (SonarQube)') {
            steps {
                echo 'Lancement de l\'analyse SonarQube...'
                // sh 'sonar-scanner -Dsonar.projectKey=biblio-java -Dsonar.sources=src/biblio'
            }
        }

        stage('Build Docker') {
            steps {
                echo 'Construction des images via Docker Compose...'
                sh 'docker-compose build'
            }
        }

        stage('Déploiement') {
            steps {
                echo 'Lancement du conteneur de la bibliothèque...'
                sh 'docker-compose up -d'
            }
        }
    }

    post {
        success {
            echo 'Envoi de la notification de succès sur Slack...'
            // slackSend channel: '#devops-pipeline', color: 'good', message: 'Succès du pipeline CI/CD pour Gestion Bibliothèque !'
        }
        failure {
            echo 'Envoi de la notification d\'échec sur Slack...'
            // slackSend channel: '#devops-pipeline', color: 'danger', message: 'Échec du build...'
        }
    }
}