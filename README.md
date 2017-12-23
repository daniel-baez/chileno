# chileno

Chileno is a clojure implementation of [chilean RUT](http://en.wikipedia.org/wiki/Rol_%C3%9Anico_Tributario#Chile)
if you are looking for a pure Java implementation, [look here](https://github.com/daplay/jru/)


## Usage

in your project.clj:

```clojure
[chileno "0.1.1"]

```

## Examples 

```clojure

(require '[chileno.core :as rut])

(rut/make "11.111.111-1")
;; or
(rut/make "11.111.111" "1")
;; or
(rut/make "11111111-1")
;; when the rut is valid it will yield a record chileno.core.Rut{:run "11111111", :dv "1"}
;; otherwise it will return an empty map {}


;; there is also a predicate rut/valid? that will return true for the same parameters that rut/make would have returned a record

```

## License

Distributed under the Eclipse Public License, the same as Clojure.
