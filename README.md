# chileno

Chileno is a clojure implementation of [chilean RUT](http://en.wikipedia.org/wiki/Rol_%C3%9Anico_Tributario#Chile)

## Usage

in your project.clj:

```clojure
[log4j "1.2.15" :exclusions [javax.mail/mail
                            javax.jms/jms
                            com.sun.jdmk/jmxtools
                            com.sun.jmx/jmxri]]
```

## Examples 

```clojure

(use 'korma.db)
(defdb db (postgres {:db "mydb"
                     :user "user"
                     :password "dbpass"}))

(use 'korma.core)
(defentity users)

```

## License

Distributed under the Eclipse Public License, the same as Clojure.
