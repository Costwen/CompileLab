# LAB08 IDEA

## part 13

最关键的问题是如何记录函数表.

我们需要记录的有`函数名`,`函数返回类型`,`函数参数个数`, `函数参数类型`

对应已有的逻辑为

```
    identTable  函数名 -> type = func
    functype    函数名 -> type = 函数返回类型
    函数参数个数 函数名 -> ArrayList<String> 同时存储参数类型和个数
```

当遇到一个函数同时将这个函数添加到全局变量表之中。

```java
this.identifier.reset();
visit(func);
this.identifier.recovery();;
```


进行判断一个调用是否合法的逻辑:

```java
    if (params.size() != funcparms.size()){
        System.exit(-1);
    }
    for (int i = 0; i < funcparams.size(); i++){
        if (!params.get(i).type.equals(funcparms.get(i).type)){
            System.exit(-1);
        }
    }
```



同时每新建立一个函数, 我们都需要重新建立一个计数器, 但是需要保存全局变量表。实现的逻辑应该是。 所以我们的全局变量表应该为所有的共享, 并且Identifier类应该提供一个重置当前类的接口和复原上一次的接口。

```java
class Identifier{
    static T globalTable;
    public Identifier reset(){
        this.identifier = new Identifier();
    }
    public Identifier recovery(){
        this.identifier = this.lastIdtifier;
    }

}
```