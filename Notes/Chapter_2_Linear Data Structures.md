
## Abstract data Type

- data, operations, error conditions
- implementation invove algorithms along with their time and space complexities
- Things to do with data - data collection, Data Processing, Data output , Data storage
- Eg.:
  - List, stacks, array list
  - Sets, maps, dictionaries, heaps tables
  - graphs
- OPerations:
  - Add
  - Remove
  - Contains
  - Union
  - Find
  - Min
  - Insert
  - Delete

## Map Abstract data type

The map is an abstract data type that contains a collection of records.
Every record of a map contains a key and a value.
Every key in the map has to be unique.

- put(key, value): A new key-value pair is added to the map. In case, if the key already exists in the map then the old value is replaced by the new.
- get(key): A key is passed here and with the help of the key we can retrieve the value which is associated with the given key.
- len(): This operation returns the length of the map i.e. the number of key-value pairs.
- del: This operation is used to delete a specific key-value pair from the map. This is how it is done: del map[key]. The particular key and its associated value get deleted from the map.
- in: This operation returns a boolean value. It returns true if the given key exists in the map, else returns false.
