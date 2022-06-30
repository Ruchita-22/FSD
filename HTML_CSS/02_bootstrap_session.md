Responsive Web Page
-------------------

## Media queries
https://developer.mozilla.org/en-US/docs/Web/CSS/Media_Queries/Using_media_queries



Media queries
    - Conditionally applying styles to pages based on device width, device type ....

    @media screen and (min-width: 480px) and (max-width: 768px){
        .selector{

            styling for this device
        }
    }


    Breakpoints:
    320px    — 480px: Mobile devices
    481px   — 768px: iPads, Tablets
    769px   — 1024px: Small screens, laptops
    1025px  — 1200px: Desktops, large screens
    1201px and more —  Extra large screens, TV

    Mobile first:
    Standard CSS
    
        @media (min-width:480px ){
            styling for tablet
        }
        
        @media (min-width:768px ){
            styling for tablet
        }


## Bootstrap
 - Helps to develop responsive web pages quickly
 - mobile first
 - built in components - already responsive
 - provides a huge set of built in css classes
    - spacing
    - text
    - button
    - color
    .......

Components, utiility

Grid System for Layout