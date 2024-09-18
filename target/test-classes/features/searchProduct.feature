Feature: Search and Place the order for Products

@OffersPage
Scenario: Search Experience for product search in both home and Offer page

Given User is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page
And validate product name in offers Page matces with Landing Page

Examples:
| Name  |
| Tom   |
| musk  |
| ban   |
| app   |
| Stra  |

