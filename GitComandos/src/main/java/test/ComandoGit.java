package test;

public class ComandoGit {

	public static void main(String[] args) {
		
		ConEmuPack.180506
		
		//comando basicos git 
		
		// git init -INICIALIZAR GIT NO DIRETORIO
		// git remote add origin - SUBIR CODIGO NO GITHUB
		//git status - VERIFICAR STATUS DO GIT
		// git add - ADD NO REPOSITORIO LOCAL 
		//git commit -m "" - ADD REPOSITORIO DO GIT
		//git pull - PEGAR DE DIFERENTE DO SERVIDOR GIT --
		//git push - SUBIR CODIGO PARA O SERVIDOR
		
		//git config --global user.name "Izac" - configurar usuario
		//git config --global user.email "izacjunior@gmail.com" - EMAIL
		//git config --list - VER CONFIGURAÇÃO
		
		//git log --decorate - ver log pelas branch
		//git log --author ="will"
		//git shortlog -sn
		//git show has
		
		//git diff - ver as modificaçoes feitas no codigo
		//git diff --name-only - ver somente o nome dos arquivos que foram modificados
		
		//git reset HEAD nomeArquivo - voltar arquivo do add tirar
		//git reset --soft has- Volta o commit para add retirando somente as alterações atraves do has que deseja
		//git reset --mixed - VOLTA COMMIT E O ADD OS ARQUIVOS 
		//git reset --hard - Retira tudo que foi alterado 
			
		//git checkout -b nomeBranch - CRIAR UMA BRANCH
		//git branch - NOME DAS BRANCH
		//git checkout nomeBranch - ACESSAR BRANCH
		//git branch -D nomeBranch - DELETAR BRANCH
		//git push origin : nomeBranch
		
		//git stash apply- RETORNAR O QUE ESTAVA GUARDADO
		//git stash list - APRESENTA TODOS STASH
		
		//git config --global alias.s status - CRIAR ATALHO DE COMANDOS EXEMPLO COM STATUS
		//
		//git tag -a 1.0.0 -m "FINALIZADO" - CRIAR TAGS
		//git tag -d nomedaTag - DELETAR TAG
		//git push origin : nomeTag
		
		// 
		
	}

}
