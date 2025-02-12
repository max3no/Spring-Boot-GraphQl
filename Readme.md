<h3>Spring-Boot + GraphQls</h3>

use - http://localhost:8080/graphiql

to be updated...

```
query {
  getAllUsers {
    id
    email
    posts {
      title
    }
  }
}

```


```
{
  getUserById(id: 1) {
    name
    email
    posts {
      title
      content
    }
  }
}
```