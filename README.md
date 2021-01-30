# Docker & Kubernetes

Docker & Kubernetes para desenvolvedores Java

### Comandos Docker
- ```docker ps -a  ```  : Lista todos os containers na máquina
- ```docker rm {{ CONTAINER_ID }} ``` : Remove um determiado container passando seu CONTAINER_ID
- ```docker rm $(docker ps -a -q) ``` : Remove todos os containers na máquia 
- ```docker rmi {{ IMAGE_ID }} ``` : Remove uma imagem passado seu IMAGE_ID
- ```docker images ``` : Lista todas as imagesn na máquina
- ```docker images $(docker images -q) ``` : Remove todas as imagens da máquina 
- 




### Comandos Kubernetes
> Instalando o Kubernetes (mini-kube)
