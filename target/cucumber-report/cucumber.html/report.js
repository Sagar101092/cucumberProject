$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("finddealers.feature");
formatter.feature({
  "line": 2,
  "name": "Find the dealers and verify",
  "description": "",
  "id": "find-the-dealers-and-verify",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10709878600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Find the dealers and verify the dealers are in list",
  "description": "",
  "id": "find-the-dealers-and-verify;find-the-dealers-and-verify-the-dealers-are-in-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on buy+sell tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click ‘Find a Dealer’",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to car-dealers page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should see the dealer names \u003cdealersName\u003e are display on page",
  "rows": [
    {
      "comments": [
        {
          "line": 11,
          "value": "#    |  dealersName            |"
        }
      ],
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 12
    },
    {
      "cells": [
        "WD Specialist Group"
      ],
      "line": 13
    },
    {
      "cells": [
        "5 Star Auto"
      ],
      "line": 14
    },
    {
      "cells": [
        "A \u0026 M Car Sales Pty Ltd"
      ],
      "line": 15
    },
    {
      "cells": [
        "A1 MOTORS COMPANY"
      ],
      "line": 16
    },
    {
      "cells": [
        "ANDREA MOTORI SERVICE"
      ],
      "line": 17
    },
    {
      "cells": [
        "Oxford Motors"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BuySteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 256805800,
  "status": "passed"
});
formatter.match({
  "location": "BuySteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 220635600,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iClickFindADealer()"
});
formatter.result({
  "duration": 2781832000,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iNavigateToCarDealersPage()"
});
formatter.result({
  "duration": 91500,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable)"
});
formatter.result({
  "duration": 12972048500,
  "status": "passed"
});
formatter.after({
  "duration": 720067300,
  "status": "passed"
});
});