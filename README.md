# ZAGHDOUDI-mahdi-ROUIGHI-Ramy
TP1
Question 7 : Le problème qui peut se poser dans la méthode animer()  de la classe Dessin après le ré Factoring est :
Nous avons définis une nouvelle interface IObjetAnimable sous-type de IObetDessinable  pour pouvoir déplacer les objets animales de la même façon de dessiner les objets dessinable.
C’est alors que dans la classe Dessin c.deplacer() ne se compile pas car un objet peut être dessinable mais ne peut pas être obligatoirement animable.
Pour cela, il faut vérifier d’abord que l’objet est animable ensuite il faut utiliser instanceof pour pouvoir appeler la methode deplacer().



