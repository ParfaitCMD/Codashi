
// Espera o conteúdo da página carregar completamente
document.addEventListener('DOMContentLoaded', function() {

    // Encontra o container da seta pela sua classe
    const scrollArrow = document.querySelector('.seta-link');

    // Verifica se o elemento da seta realmente existe
    if (scrollArrow) {
        // Adiciona um "ouvinte" de clique ao elemento
        scrollArrow.addEventListener('click', function() {
            // Encontra a próxima seção pelo seu ID ('sobre')
            const nextSection = document.querySelector('#sobre');

            // Se a próxima seção for encontrada, rola suavemente até ela
            if (nextSection) {
                nextSection.scrollIntoView({ behavior: 'smooth' });
            }
        });
    }
});