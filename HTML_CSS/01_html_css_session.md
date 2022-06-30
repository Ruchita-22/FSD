 UI
    - HTML5/CSS3 -2 sessions
    - Bootstrap - 1 seesion
    - Nodejs
    - Angular
    
    
 Browser ---> HttpReq  ----  Server
              HttpResp <----     
        content-type - text/html            
        body -- actual html content
        
        
        
   - parses and renders the page to display on the screen
   
   - DOM
        - Document object model
        - Tree structure of nodes   
        
        
### HTML5/CSS3

  - Hypertext markup language
  
  
    HTML - defining the structures of a page
    CSS  - styling - make the page presentable
    JS   - Mke the page interactive    
    
    
    
    HTML - defining the structures of a page
    
        <!DOCTYPE html>
        
        - has tags
            - div
            - h1 --- h6
            - p
            - forms ---- input elements
            - tables
            - ul,  ol
     
    REF: https://developer.mozilla.org/en-US/docs/Glossary/Semantics   
      more semantic tags 
        - header, footer, nav, section, article, aside, main .......
    
            - type of content
            - role
            - identified by some tools
    
    
    Tools: 
        Browser
        VS code
        Live Server
    
    
    CSS Styling
    -------------
        - inline            - <h1 style="color: red">...</h1>
        
        - internal          
                head
                    <style>
                        styling info
                    </style> 
        
        - external stylesheet
            styles.css
            
            link the stylesheet with the html page - in the head section
      
        
        Selectors:
            Identifies html elements to which style ahs to be applied
            
                - tag  
                    select tags of that type
                    h1{
                        color: red
                    }
    
                - class
                    select the elements based on the class attribute
                    html
                    <h1 class='test'>...</h1>
                   
                    css
                    
                    .test{
                        style info
                    }
                    
                - id
                    select the elements based on the id attribute
                    
                    html
                    <h1 id='one' class='test'>...</h1>
                   
                    css
                    
                    #one{
                        style info
                    }
                 
            REF : https://developer.mozilla.org/en-US/docs/Learn/CSS/Building_blocks/Selectors/Combinators
            REF : https://flukeout.github.io/
            Combinators:
                - div p{  }     - all paragraphs within a div
                - header h1{ }   - all h1 within a header
                - .test > p{  }  - direct child
                - div + p { }   adjacent
                
                - p.detail {}  paragraph with class detail
                 
                
          Units of measurements
          
            absolute
                px, mm, cm , inch ...
            
            
            relative           
                - vh, vw   (viewport height width)
                - em (font size of parent element
                - rem ( font size of the rrot element
                - % (percentage of the parent elemt
                
    
            CSS Box Model
                - content
                - padding
                - border
                - margin
            
            REF: https://developer.mozilla.org/en-US/docs/Web/CSS/transform
            
            
     Types of Element
     
        - inline
            occupy the width based on the size of content
            anchor, image, button, span
        
        
        - block element
            - occupy the whole width of the parent element       
             - div , p, section, h1-h6, ul, ol ........
             
       display:  inline, block, flex, grid
            
            
      pseudo classes:
      
        hover:
        link:
        visited:
        .......
        
        
        
   REF: 
   https://css-tricks.com/snippets/css/a-guide-to-flexbox/     
   https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Flexbox
   
      
    CSS3 - Flexbox layout
    
    - Single dimensional
    - items will automatically shrink/expand
    - Responsive
    
    simple - medium
    
    
    
    REF:
    
    https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Grid_Layout
    https://css-tricks.com/snippets/css/a-guide-to-flexbox/
    
    Grid Layout
    -------------
    
    - two dimensional
    - both rows as  well as colums
    - more finer control
    
    complex pages        
      
            
            
            
            
            
            
            
            
            
            
            
            
    
  
