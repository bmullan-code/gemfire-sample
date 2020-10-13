import requests

from edepLookups import error_cat

api = "https://gemfire-sample.apps.stonington.stream/errorcats"

for e in error_cat:
	print (e[0])
	ec = { 'id' : e[0], 'shortDesc' : e[1], 'longDesc' : e[2] }
	r = requests.post(url = api, json = ec)
	print(r)

	


