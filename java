// Pobieranie artykułów
function getArticles() {
  return JSON.parse(localStorage.getItem("articles") || "[]");
}

// Zapisywanie artykułów
function saveArticle(article) {
  const articles = getArticles();
  articles.unshift(article);
  localStorage.setItem("articles", JSON.stringify(articles));
}

// Wyświetlanie artykułów na stronie
function renderArticles(containerId) {
  const container = document.getElementById(containerId);
  const articles = getArticles();

  container.innerHTML = "";

  articles.forEach(a => {
    const el = document.createElement("div");
    el.className = "article";
    el.innerHTML = `
      <h3>${a.title}</h3>
      <div class="meta">Dział: ${a.category} • Data: ${a.date}</div>
      <p>${a.content}</p>
    `;
    container.appendChild(el);
  });
}
