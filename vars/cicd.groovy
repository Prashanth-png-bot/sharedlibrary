def gitDownload(repo)
{
    git "https://github.com/Prashanth-png-bot/${repo}.git"	
}
def buildArtifact()
{
    sh "mvn package"
}
