(ns frontend.modules.shortcut.dicts.pt-br
  "Provides dictionary entries for shortcuts in pt-BR")

(def dict
  {:shortcut.category/formatting            "Formatação"
   :shortcut.category/basics                "Básico"
   :shortcut.category/navigating            "Navegação"
   :shortcut.category/block-editing         "Edição geral de blocos"
   :shortcut.category/block-command-editing "Comandos de edição de blocos"
   :shortcut.category/block-selection       "Seleção de blocos (aperte Esc para sair)"
   :shortcut.category/toggle                "Alternar"
   :shortcut.category/others                "Outros"
   :command.editor/indent                   "Aumentar avanço de parágrafo"
   :command.editor/outdent                  "Diminuir avanço de parágrafo"
   :command.editor/move-block-up            "Mover bloco para cima"
   :command.editor/move-block-down          "Mover bloco para baixo"
   :command.editor/new-block                "Criar novo bloco"
   :command.editor/new-line                 "Nova linha no bloco actual"
   :command.editor/zoom-in                  "Aproximar / Para a frente"
   :command.editor/zoom-out                 "Afastar / Para trás"
   :command.editor/follow-link              "Seguir ligação sob o cursor"
   :command.editor/open-link-in-sidebar     "Abrir ligação na barra lateral"
   :command.editor/expand-block-children    "Expandir"
   :command.editor/collapse-block-children  "Recolher"
   :command.editor/select-block-up          "Selecionar bloco acima"
   :command.editor/select-block-down        "Selecionar bloco abaixo"
   :command.editor/select-all-blocks        "Selecionar todos os blocos"
   :command.ui/toggle-help                  "Alternar ajuda"
   :command.git/commit                      "Confirmar"
   :command.go/search                       "Pesquisar no grafo"
   :command.go/search-in-page               "Pesquisar na página atual"
   :command.ui/toggle-document-mode         "Alternar modo de documento"
   :command.ui/toggle-contents              "Alternar Conteúdo na barra lateral"
   :command.ui/toggle-theme                 "Alternar entre tema claro/escuro"
   :command.ui/toggle-right-sidebar         "Alternar barra lateral"
   :command.ui/toggle-settings              "Alternar Opções"
   :command.go/journals                     "Ir para diários"
   :command.ui/toggle-wide-mode             "Alternar largura extendida"
   :command.ui/toggle-brackets              "Alternar colchetes"
   :command.search/re-index                 "Reconstruir índice de pesquisa"
   :command.editor/bold                     "Negrito"
   :command.editor/italics                  "Itálico"
   :command.editor/insert-link              "Inserir vínculo"
   :command.editor/highlight                "Realçado"
   :command.editor/undo                     "Desfazer"
   :command.editor/redo                     "Refazer"
   :command.editor/copy                     "Copiar"
   :command.editor/cut                      "Cortar"
   :command.editor/up                       "Mover cursor para cima / Selecionar para cima"
   :command.editor/down                     "Mover cursor para baixo / Selecionar para baixo"
   :command.editor/left                     "Mover cursor para a esquerda / Abrir bloco selecionado no início"
   :command.editor/right                    "Mover cursor para a direita / Abrir bloco selecionado no final"
   :command.editor/backspace                "Retroceder / Eliminar para trás"
   :command.editor/delete                   "Deletar / Eliminar para frente"
   :command.editor/cycle-todo               "Alternar estado A FAZER do elemento"
   :command.editor/clear-block              "Apagar conteúdo do bloco"
   :command.editor/kill-line-before         "Apagar linha antes do cursor"
   :command.editor/kill-line-after          "Apagar linha depois do cursor"
   :command.editor/beginning-of-block       "Mover o cursor para o início do bloco"
   :command.editor/end-of-block             "Mover o cursor para o fim do bloco"
   :command.editor/forward-word             "Mover o cursor para a próxima palavra"
   :command.editor/backward-word            "Mover o cursor para a palavra anterior"
   :command.editor/forward-kill-word        "Apagar a próxima palavra"
   :command.editor/backward-kill-word       "Apagar a palavra anterior"
   :command.editor/open-edit                "Editar bloco selecionado"
   :command.editor/delete-selection         "Eliminar blocos selecionados"
   :command.editor/toggle-open-blocks       "Alternar blocos abertos (recolher ou expandir todos)"
   :command.auto-complete/complete          "Auto-completar: Escolha o item selecionado"
   :command.auto-complete/next              "Auto-completar: Selecione o próximo item"
   :command.auto-complete/prev              "Auto-completar: Selecione o item anterior"
   :command.auto-complete/shift-complete    "Auto-completar: Abra o item selecionado na barra lateral"
   :command.cards/forgotten                 "Cartões: Esquecido"
   :command.cards/next-card                 "Cartões: Próxima carta"
   :command.cards/recall                    "Cartões: Demorar um pouco para lembrar"
   :command.cards/remembered                "Cartões: Relembrado"
   :command.cards/toggle-answers            "Cartões: mostrar/esconder as respostas/clozes"
   :command.command/toggle-favorite         "Adicionar aos/remover dos favoritos"
   :command.command-palette/toggle          "Editar atalhos"
   :command.date-picker/complete            "Escolher data: Escolha o dia selecionado"
   :command.date-picker/next-day            "Escolher data: Selecione o próximo dia"
   :command.date-picker/next-week           "Escolher data: Selecione a próxima semana"
   :command.date-picker/prev-day            "Escolher data: Selecione o dia anterior"
   :command.date-picker/prev-week           "Escolher data: Selecione a semana anterior"
   :command.editor/escape-editing           "Sair da edição"
   :command.editor/insert-youtube-timestamp "Inserir timestamp do youtube"
   :command.editor/paste-text-in-one-block-at-point "Colar texto em um bloco no ponto"
   :command.editor/replace-block-reference-at-point "Substitua a referência do bloco pelo seu conteúdo no ponto"
   :command.editor/strike-through           "Tachar"
   :command.go/all-pages                    "Ir para todas as páginas"
   :command.go/backward                     "Voltar"
   :command.go/flashcards                   "Trocar flashcards"
   :command.go/forward                      "Avançar"
   :command.go/graph-view                   "Ir para o grafo"
   :command.go/home                         "Volar para o inicio"
   :command.go/keyboard-shortcuts           "Ir para os atalhos do teclado"
   :command.go/next-journal                 "Ir ao proximo jornal"
   :command.go/prev-journal                 "Ir ao jornal anterior"
   :command.go/tomorrow                     "Ir para amanhã"
   :command.graph/add                       "Adicionar um grafo"
   :command.graph/open                      "Selecionar grafo para abrir"
   :command.graph/remove                    "Remover um grafo"
   :command.pdf/next-page                   "Próxima página do atual pdf doc"
   :command.pdf/previous-page               "Página anterior do atual pdf doc"
   :command.sidebar/clear                   "Limpar tudo da barra lateral direita"
   :command.sidebar/open-today-page         "Abrir a página de hoje na barra lateral direita"
   :command.ui/select-theme-color           "Selecionar as cores do tema disponível"
   :command.ui/toggle-cards                 "Trocar cartões"
   :command.ui/toggle-left-sidebar          "Trocar barra lateral esquerda"
   :command.auto-complete/open-link         "Auto-completar: Abra o item selecionado no navegador"
   :command.command/run                     "Execute o comando Git"
   :command.editor/copy-current-file        "Copiar o arquivo atual"
   :command.editor/open-file-in-default-app "Abra o arquivo no aplicativo padrão"
   :command.editor/open-file-in-directory   "Abra o arquivo na pasta"
   :command.graph/save                      "Salvar grafo atual no computador"
   :command.misc/copy                       "Copiar (copiar seleção ou referência do bloco)"
   :command.ui/goto-plugins                 "Ir para o painel de plugins"
             ;;  :command.ui/open-new-window              "Abra uma nova janela"
   :command.editor/select-down              "Selecione o conteúdo abaixo"
   :command.editor/select-up                "Selecione o conteúdo acima"
   :command.editor/copy-embed               "Copiar uma incorporação do bloco, apontando para o bloco atual"
   :command.editor/copy-text                "Copiar seleção como texto"
   :command.pdf/close                       "Fechar visualização do PDF"
   :command.go/all-graphs                   "Ir à todos os grafos"
   :command.go/electron-find-in-page        "Localizar texto na página"
   :command.go/electron-jump-to-the-next    "Ir para a próxima correspondência da sua pesquisa"
   :command.go/electron-jump-to-the-previous "Voltar para a correspondência anterior da sua pesquisa"
   :command.graph/re-index                  "Reindexar o grafo atual"

   :command.editor/new-whiteboard           "Novo quadro branco"
   :command.editor/select-parent            "Selecione o bloco pai"
   :command.go/whiteboards                  "Ir para os quadros brancos"
   :command.graph/export-as-html            "Exportar páginas de gráficos públicos como html"
   :command.pdf/find                        "PDF: Pesquisar no documento PDF atual"
   :command.sidebar/close-top               "Fechar item superior na barra lateral direita"
   :command.ui/install-plugins-from-file    "Instalar plugins de plugins.edn"})
