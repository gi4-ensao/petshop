Drop DATABASE if exists petshop;
CREATE DATABASE if not exists petshop;
 
CREATE  TABLE if not exists `petshop`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(255) NULL,
  `image` VARCHAR(45) NULL,
  `price` DOUBLE NULL,
  `quantity` INT NULL,
  `category` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));




INSERT INTO `petshop`.`product`  (name ,description,image,price,quantity,category) VALUES ('Cage  pour Petits Oiseaux ','Cage pour oiseaux exotiques et canaris en métal robuste et vernis avec bac en plastique rigide. Plateau pratique et extractible pour recueillir la saleté, nettoyage et entretien faciles. Dotée de poignée pratique sur le dessus et porte d''accès à la cage ','images/Product1_Birds.jpg',25.99,100,'Birds');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('6 pièces Jouet Perroquet','L''ensemble comprend 6 types différents de jouets pour oiseaux, qui peuvent être adaptés à divers types d''exercices d''escalade de perroquet, y compris un pont suspendu rouge coloré, une corde de cloche en acrylique, une corde de sépak takraw et une corde de cloche qui peuvent être grimpées et mordues, etc., pour satisfaire vos oiseaux Jeu quotidien.','images/Product2_Birds.jpg',13.99,50,'Birds');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Graines pour Oiseaux','La nourriture pour oiseaux de première qualité est une alternative équilibrée et riche en énergie aux aliments vivants. La nourriture toutes saisons est enrichie de céréales à haute énergie, de graines de tournesol et d''arachides - un rêve d''oiseau avec tous les nutriments nécessaires pour les oiseaux sauvages. Sans blé! .','images/Product3_Birds.jpg',28.90,20,'Birds');


INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Caisse de Transport Chat','Ce transporteur pour animaux de compagnie est idéal pour voyager en avion ou en voiture ou tout simplement pour rendre visite à un vétérinaire et convient aux chats pesant jusqu''à 7 kg.','images/Procduct1_Cats.jpg',34.99,20,'Cats');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Jouet pour Chat ','À l''aide de l''impression bionique 3D, le poisson de simulation ressemble à un vrai poisson, capteur tactile intégré, caresse ou touche le corps du poisson, le jouet pour chat de poisson flopera ou remuera automatiquement, satisfaisant complètement la curiosité de votre animal à propos du poisson !','images/Product2_Cats.jpg',16.6,20,'Cats');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Arbre à Chat XXL','3 condos spacieux offrent une sieste luxueuse ; 3 perchoirs en peluche avec un bord surélevé offrent plus de sécurité aux chats pour qu''ils puissent profiter du sentiment d''être au sommet du monde tout en se reposant. 3 balles interactives pour jouer, une disposition à plusieurs niveaux pour monter et descendre, une piste couverte de sisal pour un jeu beaucoup plus amusant','images/Procduct3_Cats.jpg',99.99,20,'Cats');

INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Manteau  Chiens','La conception unique garde votre chien à la mode et confortable, parfait pour marcher, courir, chasser ou faire de la randonnée pendant les mois froids.','images/Product1_Dogs.jpg',22.99,20,'Dogs');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Brosse a Dent','Jouet Brosse a Dent pour Chien est en caoutchouc naturel non toxique et inodore. Nous avons également épaissi la structure interne pour la rendre plus durable que les autres chiens similaires Brosse a Dent. Ce Jouet Brosse à Dent pour Chien est suffisamment solide pour résister aux morsures et aux croquettes des chiens, ainsi que d''une qualité supérieure et d''une durée de vie plus longue.','images/Procduct2_Dogs.jpg',13.99,20,'Dogs');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Harnais Chien ','Ce harnais pour chien est facile à porter et à ajuster. Les fermetures rapides à pression assurent une facilité d''utilisation lors de la mise en place et du retrait. Les sangles ajustables à la poitrine et au cou permettent un ajustement personnalisé pour votre ami de la fourrure. Parfait pour la marche quotidienne, la course à pied, le jogging, la randonnée, l''entraînement, le plaisir en plein air, etc..','images/Product3_Dogs.jpg',19.99,20,'Dogs');

INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('2 Pièces Jouets','Matières premières naturelles.Le tourteau d''herbe est fait de poudre d''herbe de haute qualité, riche en protéines et en calcium, parfaitement adaptée à la croissance des animaux de petite taille. Les branches de bois de pommier peuvent prévenir efficacement les déformations.','images/Procduct1_Hamsters.jpg',12.99,20,'Hamsters');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Hamster Habitat','Conception à glissière, vous pouvez retirer le coton intérieur, facile à laver à la main ou à la machine à laver. Toutes les finitions sont non toxiques, sûres et respectueuses de l''environnement.','images/Procduct2_Hamsters.jpg',17.49,20,'Hamsters');
INSERT INTO `petshop`.`product` (name ,description,image,price,quantity,category) VALUES ('Roues d''exercice Hamster','Spécialement conçu pour une rotation silencieuse. Silent Spinner réduit le bruit, ce qui les rend bien fonctionnés par rapport aux roues d''exercice traditionnelles. Les produits sont non seulement jouets, mais ils sont également des jouets à mâcher pour les animaux, masser leurs gencives et promouvoir la santé dentaire.','images/Procduct3_Hamsters.jpg',15.89,20,'Hamsters');