# statement vs prepared statement
Most relational databases handles a JDBC / SQL query in four steps:

Parse the incoming SQL query
Compile the SQL query
Plan/optimize the data acquisition path
Execute the optimized query / acquire and return data

A Statement will always proceed through the four steps above for each SQL query sent to the database. A Prepared Statement pre-executes steps (1) - (3) in the execution process above. 
Thus, when creating a Prepared Statement some pre-optimization is performed immediately. The effect is to lessen the load on the database engine at execution time.