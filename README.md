# Medical Auto-Diagnostic System

### Design Patterns Utilisés

- **Strategy Pattern** : Ce pattern est utilisé pour encapsuler les différentes stratégies de pathologie (Cardiologie, Traumatologie). Chaque stratégie implémente l'interface `PathologyStrategy` et fournit une méthode pour vérifier si la stratégie s'applique à un index de santé donné, et pour retourner l'unité médicale correspondante.
  - `CardiologyStrategy` : Détecte les pathologies cardiaques.
  - `TraumatologyStrategy` : Détecte les fractures.

- **Factory Pattern** : Le **PathologyFactory** est utilisé pour récupérer les stratégies applicables en fonction de l'index de santé fourni. Il parcourt les différentes stratégies enregistrées et renvoie celles qui sont pertinentes.

Ces patterns permettent d'ajouter de nouvelles pathologies ou de modifier les logiques existantes sans changer le code principal, ce qui rend le système facilement extensible et maintenable.

### Tests Unitaires

Des tests unitaires ont été ajoutés pour valider les différents scénarios de pathologies, y compris :
- La détection d'un problème cardiaque.
- La détection d'une fracture.
- La détection des deux pathologies à la fois (cardiaque et fracture).

Ces tests permettent de s'assurer que le système fonctionne correctement dans tous les cas possibles.
