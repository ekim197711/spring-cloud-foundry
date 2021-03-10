cd $(dirname $0)
curl -H "Content-Type: application/json" \
-X POST -d @./ship.json "https://gimmesoda.de.a9sapp.eu/api/ship"
