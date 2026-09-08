body {
  font-family: system-ui, sans-serif;
  margin: 0;
  background: #f5f5f5;
  color: #222;
}

header {
  background: #1e88e5;
  color: white;
  padding: 20px;
  text-align: center;
}

nav {
  background: #1565c0;
  display: flex;
  gap: 16px;
  padding: 10px 20px;
  flex-wrap: wrap;
}

nav a {
  color: #fff;
  text-decoration: none;
  font-size: 0.9rem;
  padding: 4px 8px;
  border-radius: 4px;
}

nav a:hover {
  background: rgba(255, 255, 255, 0.15);
}

main {
  max-width: 1000px;
  margin: 20px auto;
  padding: 0 16px 40px;
}

.article {
  background: white;
  padding: 16px;
  border-radius: 8px;
  margin-bottom: 20px;
  box-shadow: 0 2px 6px rgba(0,0,0,0.06);
}

.article h3 {
  margin: 0 0 6px;
}

.meta {
  font-size: 0.8rem;
  color: #666;
  margin-bottom: 10px;
}

footer {
  text-align: center;
  padding: 20px;
  font-size: 0.8rem;
  color: #777;
}
