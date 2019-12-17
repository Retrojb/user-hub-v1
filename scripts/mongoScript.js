conn = new Mongo()

db = conn.getDB('dev-user-hub')
printjson({"DB Name": db.getName(), "Collections :" : db.getCollectionNames()})