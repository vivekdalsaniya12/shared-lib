// def call(String USERNAME, String PASSWORD, String DOCKER_IMAGE, String IMAGE_TAG){
//   sh """
//       echo PASSWORD | docker login -u USERNAME --password-stdin
//       docker push DOCKER_IMAGE:IMAGE_TAG
//       docker logout
//   """
// }
def call(String USERNAME, String PASSWORD, String DOCKER_IMAGE, String IMAGE_TAG){
  sh """
      echo '${PASSWORD}' | docker login -u '${USERNAME}' --password-stdin
      docker push ${DOCKER_IMAGE}:${IMAGE_TAG}
      docker logout
  """
}
