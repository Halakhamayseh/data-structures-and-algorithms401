# Hashtables

Hashtable was part of the original java. It is similar to HashMap, but is synchronized. Like HashMap, Hashtable stores key/value pairs in a hash table. When using a Hashtable, you specify an object that is used as a key, and the value that you want linked to that key

## Challenge

Implement a Hashtable Class with the following methods:add,get,contains and hash

## Approach & Efficiency

Big O space/time
big O(n)

## API

1. add
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

2. get
Arguments: key
Returns: Value associated with that key in the table

3. contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

4. hash
Arguments: key
Returns: Index in the collection for that key.
