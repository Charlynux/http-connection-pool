# Comparaison avec ou sans "HTTP Connection Pool"

Un simple repository pour tester ce que donne un pool de connexions HTTP.

Une boucle de 1000 requêtes à un serveur local (sans HTTPS) :
- Sans pool : ~500-600ms
- Avec pool : ~300-400ms
