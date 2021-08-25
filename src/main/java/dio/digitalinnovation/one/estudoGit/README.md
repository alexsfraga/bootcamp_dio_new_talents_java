# Estudando sobre GIT

## Entendendo a estrutura básica do GIT

  

#### -_Estrutura de Verificação de arquivos_

* Hash SHA1

   

#### -_Estrutura de funcionamento e arquivamento_

* BLOB

* TREE

* COMMIT

     

#### -_Ciclo de vida dos arquivos_

* UNTRACKED

* TRACKED ( UNMODIFIED / MODIFIED / STAGED)

     

#### -_Arquivo de apresentação_

* README.md

  

## Entendendo sobre comandos do GIT

  

#### -_Comandos Básicos_

* git init  ( inicializa o git no diretorio onde o comando foi executado )
* git config --global user.name "NOME DESEJADO"  ( especifica o nome que sera vinculado no github junto a estrutura a sofrer o commit )
* git config --global user.email "EMAIL DESEJADO"
* git config --list  (exibi as configurações do config)
* git add .   (adiciona todos os arquivos para TRACKED e STAGED)
* git status ( exibi o status dos arquivos no modo TRACKED )
* git commit -m "DESCRITIVO"  ( cria um estado "do" ou "dos" arquivos que estavam no STAGED passando-os para o estado UNMODIFIED, e popula o repositorio local com este estado "commit" )

  

#### -_Comando visando a relação com o servidor GITHUB_

* git remote add origin "ENDEREÇO REPOSITORIO NO GITHUB"  ( especifica no repositório local, para qual repositório remoto este estará ligado )
* git remote -v ( exibe o lista de links dos repositórios remotos cadastrados e sao apelidades internamente no git com a palavra "origin" )
* git push origin master ( envia ou empurra para o servidor remoto o conteúdo do repositório local, a palavra "master" é o nome dado para identificar o branch principal do repositório)



#### -_Comando para atualizar repositório local a partir do repositório remoto_

* git pull origin master ( ira baixar o conteúdo do repositório remoto para o local aplicando o merge para solução de conflitos ou não dependendo da configuração de merge especificada )



#### -_Comando para clonar um repositorio a partir do GITHUB para maquina local_  

* git clone " LINK DO REPOSITORIO REMOTO GITHUB " ( este comando ira criar a pasta do repositório local, já contendo o conteúdo e ou a  estrutura de controle com a pasta ".git" )

  
